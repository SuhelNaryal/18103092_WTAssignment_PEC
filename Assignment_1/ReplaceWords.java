import java.util.Scanner;

public class ReplaceWords {
    
    public String replaceWords(String paragraph, String[] words){
        if(paragraph == null || paragraph.length() < 1)
            return null;
        if(words == null || words.length < 1)
            return paragraph;
        
        StringBuilder substitute;
        for(String word: words){
            substitute = new StringBuilder();
            substitute.append(word.charAt(0));
            for(int i=0; i<word.length()-1; ++i)
                substitute.append('*');
            
            paragraph = paragraph.replaceAll(word, substitute.toString());
        }
        
        return paragraph;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to replace words in paragraph");
        System.out.println("Enter paragraph(Single Line):");
        String paragraph = sc.nextLine();
        System.out.println("Enter no. of words:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];
        System.out.println("Enter words: ");
        for(int i=0; i<n; ++i){
            words[i] = sc.nextLine();
        }

        System.out.println((new ReplaceWords()).replaceWords(paragraph, words));
    }
    
}
