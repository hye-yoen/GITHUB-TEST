package Ch08.ex;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class 문제1test{
    private static Scanner sc = new Scanner(System.in);
    private static List<String> wordList = new ArrayList<String>();
    
    //정렬 여부
    private static void sort(boolean isAsend){
        if(isAsend ==true){
            wordList.sort(Comparator.naturalOrder());
        }
        else{
            wordList.sort(Comparator.reverseOrder());
        }  

    }
    
    //단어 입력
    private static void add(String word){
        wordList.add(word);
    }
    
    //보여주기
    private static void show(){
       for(int i =0; i < wordList.size();i++){
        System.out.println(wordList.get(i)); //.get(i) 때문에 wordList의 요소만 출력
       } 
    //    for(int i =0; i < wordList.size();i++){ //wordList 객체 출력 -> 리스트 전체 출력
    //     System.out.println(wordList);
    //    } 
    }
    
    public static void main(String[] args) {
        int n =0;
        while (true) {
            System.out.println("-----메뉴-------");
            System.out.println("1 추가");
            System.out.println("2 정렬");
            System.out.println("3 확인");
            System.out.println("4 종료");
            System.out.println("-----메뉴-------");
            System.out.print("번호 : ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("단어 입력 : ");
                    String word = sc.next();
                    add(word);
                    
                    break;
                case 2:
                    System.out.print("오름차순 여부(1.오름차순,0내림차순) : ");
                    int no = sc.nextInt();
                    if(no==1){ sort(true); }
                    else{ sort(false);}

                    break;
                case 3:
                    show();    

                    break;
                case 4:
                    System.out.println("종료한다" );
                    System.exit(-1);

                    break;
                default:
                 System.out.println("다시 입력하삼");
            }
            
        }
    }
}