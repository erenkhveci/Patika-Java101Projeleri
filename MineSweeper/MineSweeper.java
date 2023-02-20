package MineSweeper;

import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    private  int[][] map;
    int number1 =-1;
    int number2 =-1;

    boolean onlyOnce=true;


    int row;
    int column;
    int[][] bombMap;
    int[][] bombArray;
    MineSweeper(int row,int column){
        this.row=row;
        this.column=column;
        map=new int[row][column];
        bombMap=new int[row][column];
        bombArray=new int[row][column];
        if(onlyOnce){

            for (int[] ints : bombArray) {
                Arrays.fill(ints, 8);
            }
            onlyOnce=false;
        }
        mapBomb();
        showBomb();
        welcome();


    }

    void welcome(){

        boolean isWin=true;
        int count=0;
        if(isFinished()){
            System.out.println("Tebrikler KAzandınız !");
        }
        while(isWin){
            isWin=!isFinished();
            Scanner sc = new Scanner(System.in);
            System.out.print("Satır Giriniz :");
            number1=sc.nextInt();
            System.out.print("Sütun Giriniz :");
            number2=sc.nextInt();

            if(isWin==false){
                break;
            }
            for (int i =0;i<bombMap.length;i++){
                for(int j =0;j<bombMap[i].length;j++){
                    if(isWin==false){
                        break;
                    }
                    if(bombMap[number1][number2]==55){
                        System.out.println("OWW fena bastın,Bir dahakine daha iyi oyna");
                        isWin=false;
                        System.exit(0);
                    }

                }


            }

            count++;
            printMap(number1,number2);

        }



    }

    private  void printMap(int number1,int number2){
        int count=0;



        if(number1+1<row){
            if((bombMap[number1+1][number2]==55)){
                count++;
            }

        }if(number1+1<row&&number2+1<column){
            if((bombMap[number1+1][number2+1]==55)){
                count++;
            }

        } if(number1+1<row&&number2-1>=0){
            if((bombMap[number1+1][number2-1]==55)){
                count++;
            }
        }if(number1-1>=0){
            if((bombMap[number1-1][number2]==55)){
                count++;
            }
        } if ((number1)-1>=0 && number2+1<column) {
            if((bombMap[number1-1][number2+1]==55)){
                count++;
            }
        } if (number1-1>=0 && number2-1>=0){
            if((bombMap[number1-1][number2-1]==55)){
                count++;
            }
        }if ( number2-1>=0){
            if((bombMap[number1][number2-1]==55)){
                count++;
            }
        }if(number2+1<column){
            if(bombMap[number1][number2+1]==55){
                count++;
            }
        }


        bombMap[number1][number2]=count;

        bombArray[number1][number2]=bombMap[number1][number2];


        for(int i=0;i<bombArray.length;i++){
            for(int j =0;j<bombMap[i].length;j++){
                if(bombArray[i][j]==8 || bombArray[i][j]==55){
                    System.out.print("- ");
                }else{
                    System.out.print(bombArray[i][j]+" ");
                }

            }
            System.out.println();
        }
    }




    private  void mapBomb(){
        int bombCount=(int)(row*column/3);
        int counter=0;
        while(counter!=bombCount){
            int rowBomb=(int)(Math.random()*row);
            int columnBomb=(int)(Math.random()*column);
            if(bombMap[rowBomb][columnBomb]!=55){
                bombMap[rowBomb][columnBomb]=55;
                counter++;
                bombArray[rowBomb][columnBomb]=55;
            }
        }

    }
    private void showBomb(){
        for(int i=0;i<bombMap.length;i++){
            for(int j=0;j<bombMap[i].length;j++){
                if(bombMap[i][j]==55){
                    System.out.print("* ");
                }else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
         boolean isFinished(){
         int count=0;
           for(int i=0;i<bombArray.length;i++){
               for (int j=0;j<bombArray[i].length;j++){
                   if(bombArray[i][j]==8){
                        count++;
                   }
               }
            }
        if(count==0){
            return true;
        }
        return false;
    }


}
