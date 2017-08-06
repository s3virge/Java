package homework.Intro.week3;

import java.util.Random;
import java.util.Scanner;

/**
 * 3.13*. Написать морской бой(1 корабль). Размер поля указывает пользователь. При промахе показывать подсказку.
 */
public class HomeWork_3_13 {
    public static void main(String[] args) {

        System.out.println("Sea fight (1 sheep)");

        //get from user the field size
        System.out.print("Enter field size: ");
        Scanner in = new Scanner(System.in);
        int iFieldSize = in.nextInt();

        BattleField objBattleField = new BattleField(iFieldSize);

        System.out.println();
        objBattleField.show();

        boolean bHit = false;
        while (!bHit) { //while missed
            System.out.println();

            bHit = objBattleField.shooting();

            System.out.println();
            objBattleField.show();

            if (!bHit) {
                System.out.println("\nYou missed");
                objBattleField.showTip();
            }
        }

        System.out.println();
        System.out.print("You Win!");
    }
}

class BattleField {

    private int iShipRow; //ship row
    private int iShipColumn; //ship column
    private int iShotRow; //row at which shoot
    private int iShotCol; //column at which shoot
    private int iBattlefieldSize; //battlefield size
    private String[][] strArrBattleField; //battlefield

    public BattleField(int iBFsize) {
        iBattlefieldSize = iBFsize;
        genBattleField();
    }

    private void genBattleField() {

        int iFieldSize = iBattlefieldSize + 1; //
        strArrBattleField = new String[iFieldSize][iFieldSize];
        String sAlphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < strArrBattleField.length; i++) {
            for (int j = 0; j < strArrBattleField[i].length; j++) {
                strArrBattleField[i][j] = "";
            }
        }

        for (int i = 0; i < strArrBattleField[0].length; i++) {
            strArrBattleField[0][i] = Integer.toString(i); //the first row will be the digits
            strArrBattleField[i][0] = String.valueOf(sAlphabet.charAt(i)); //the first column will be the letter
        }

        //where will be a ship
        final Random random = new Random();
        iShipRow = random.nextInt(iBattlefieldSize) + 1;
        iShipColumn = random.nextInt(iBattlefieldSize) + 1;

        //strArrBattleField[iSheepRow][iSheepColumn] = "S";
    }

    public void show() {
        for (int row = 0; row < iBattlefieldSize + 1; row++) {
            for (int col = 0; col < iBattlefieldSize + 1; col++) {
                System.out.printf("%-2s ", strArrBattleField[row][col]);
            }
            System.out.println();
        }
    }

    public boolean shooting() { //return true if hit

        String sAlphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("Where will shoot?");
        System.out.print("Enter the row: ");

        Scanner in = new Scanner(System.in);
        String sShootRow = in.next();
        sShootRow = sShootRow.toUpperCase();
        iShotRow = sAlphabet.indexOf(sShootRow);

        System.out.print("Enter the column: ");
        iShotCol = in.nextInt();

        boolean bHit = isTargetHit();

        drawShot(bHit);

        return bHit;
    }

    private boolean isTargetHit() {

        boolean bHitTarget = false;

        if (iShipRow == iShotRow && iShipColumn == iShotCol) {
            bHitTarget = true;
        }

        return bHitTarget;
    }

    private void drawShot(boolean bHit) {

        if (!bHit) {
            strArrBattleField[iShotRow][iShotCol] = "*";
        }
        else {
            strArrBattleField[iShotRow][iShotCol] = "X";
        }
    }

    public void showTip() {

        if (iShotRow == iShipRow - 1 && iShotCol == iShipColumn - 1) {
            System.out.println("Your shot near to the ship");
        }
        else if (iShotRow == iShipRow - 1 && iShotCol == iShipColumn) {
            System.out.println("Your shot near to the ship");
        }
        else if (iShotRow == iShipRow - 1 && iShotCol == iShipColumn + 1) {
            System.out.println("Your shot near to the ship");
        }
        else if (iShotRow == iShipRow && iShotCol == iShipColumn - 1) {
            System.out.println("Your shot near to the ship");
        }
        else if (iShotRow == iShipRow && iShotCol == iShipColumn + 1) {
            System.out.println("Your shot near to the ship");
        }
        else if (iShotRow == iShipRow + 1 && iShotCol == iShipColumn - 1) {
            System.out.println("Your shot near to the ship");
        }
        else if (iShotRow == iShipRow + 1 && iShotCol == iShipColumn) {
            System.out.println("Your shot near to the ship");
        }
        else if (iShotRow == iShipRow + 1 && iShotCol == iShipColumn + 1) {
            System.out.println("Your shot near to the ship");
        }
        else {
            System.out.println("Your shot away from the ship");
        }
    }
}

