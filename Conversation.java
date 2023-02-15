//package org.apache.commons.collections4;
import java.util.Scanner;
import java.util.Random;
//import java.util.Arrays;
//import java.lang.Object;


import java.util.Collections;

class Conversation {

  public static void main(String[] arguments) {

    Scanner input = new Scanner(System.in);
    System.out.print("How many rounds do you want to go? ");
    int numRounds = input.nextInt();
    System.out.println("Hello! What's on your mind?");

    String[] toMirror = {"I", "me", "you", "am"};
    String[] replacements = {"You", "you", "me", "are"};
    String[] canned_responses = {"uh huh", "nope"};
    //String[] punctuation = {"You", "you", "me", "are"};
   
    boolean isReplaced = false;
    Integer MirroredSentence = 0;
    Integer index_random = 0;


    //Strng []r = {""};
   
    for (int i = 0; i < numRounds; i++) {
      System.out.println(i);
      Scanner sentence = new Scanner(System.in);
      String ChatMessage = sentence.nextLine();
      //String[] words = sentence.next().toWordArray();
      //String ChatMessage = sentence.nextLine();
      String[] words = ChatMessage.split(" ");
      
        for(int j = 0; j<words.length; j++){
          String r = "";
          isReplaced = false;
          for(int k = 0; k<toMirror.length; k++) {
              if(words[j].equals(toMirror[k])){
                
                // System.out.println(words);
                r += replacements[k] + " ";
                isReplaced = true;
                MirroredSentence = 1;
                //r[i] = replacements[k];
            }
          
  
          } 
          // if r
            if (isReplaced == false && j+1 != words.length) {r += words[j] + " ";}

            
            if (isReplaced == false && j+1 == words.length)
            {//words[j]=last_word;
              //last_word
              r += words[j]
              +"?"
              ;};

              System.out.print(r);

            // if (MirroredSentence = false) {
            //     Random random = new Random();
            //     index_random = random.nextInt(2);
            //     r = canned_responses[index_random];
            //     }

        } 

        //if (r[i].equals("")) {r[i] = words[i];}
        
      }
    

    System.out.print("Goodbye");
    input.close();


  }
}