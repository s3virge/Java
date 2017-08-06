package LaptopSchematics;

import org.apache.commons.io.FileUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.List;

/**
 * Created by s3virge on 11.06.17.
 */
public class Main {

     public static void main(String[] args) {

        //i want to download all laptop schematics form http://kythuatphancung.vn

        //link to the list of laptop schematics
        //http://kythuatphancung.vn/search/laptop-schematics_1.html

        String strUrl;// = "http://kythuatphancung.vn/search/laptop-schematics_1.html";

        for (int iPageNumber = 139; iPageNumber <= 140; iPageNumber++){

            strUrl = "http://kythuatphancung.vn/search/laptop-schematics_" + iPageNumber + ".html";

            System.out.println("Let's analyze the page " + iPageNumber);

            Connection con = Jsoup.connect(strUrl);

            try {
                Document doc = con.get();

                //on site page have button
                // <a class="down_btn" href="http://kythuatphancung.vn/download/acer-travelmate-8372-inventec-bap-bxp0-laptop-schematics.html">Chi tiết</a>

                Elements elLinks = doc.select(".down_btn");
                //Elements elLinks = doc.select("a[href].down_btn");

                //print("\nLinks: (%d)", elLinks.size());

                for (Element link : elLinks) {
                    //Use the abs: attribute prefix to resolve an absolute URL from an attribute
                    //System.out.println(link.attr("abs:href"));
                    //System.out.println(link.attr("href"));
                    //downloadFile(link.attr("href"));
                    //downloadFileFromURL(new URL(link.attr("href")));
                    con = Jsoup.connect(link.attr("href") + "?dl");
                    con.ignoreContentType(true);
                    doc = con.get();

                    String directFileLink = doc.location();
                    System.out.println(directFileLink);

                    writeFile(directFileLink, "kythuatphancung.txt");
                }
            }
            catch (IOException e) {
                System.out.println("IOException was occured when try to connect to " + strUrl);
                e.printStackTrace();
            }
        }
    }

        //link for download the pdf file
        //http://kythuatphancung.vn/download/acer-travelmate-8372-inventec-bap-bxp30-laptop-schematics.html?dl

    private static void writeFile(String fileLinks, String fileName) {
        try {
            FileWriter file = new FileWriter(fileName, true);
            file.write(fileLinks + "\n");
            file.close();
        }
        catch (IOException ex) {
            System.out.println("An error occurred while writing the file " + fileName);
            System.out.println(ex);
            ex.printStackTrace();
        }
    }

    private static void downloadFile(String strFileUrl) throws IOException{

        String strFileName = strFileUrl.substring(strFileUrl.lastIndexOf('/')+1, strFileUrl.lastIndexOf('.') ) + ".pdf";

        URL website = new URL(strFileUrl);
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream(strFileName );
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);

        fos.close();
    }

    private static void downloadFileFromURL(URL strFileUrl)throws IOException{

        String strFileName = strFileUrl.toString().substring(strFileUrl.toString().lastIndexOf('/')+1, strFileUrl.toString() .lastIndexOf('.') ) + ".pdf";

        File file = new File(strFileName);

        FileUtils.copyURLToFile(strFileUrl, file);
    }
}
