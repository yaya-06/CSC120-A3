// //package org.apache.commons.collections4;
// import java.util.Scanner;
// import java.util.Random;
// import java.util.Arrays;
// import java.util.stream.*;
// import java.util.List;
// //import java.lang.Object;


// //import java.util.Collections;


// /**
// /* This is my Chatbot! Say Hello!
// /* @Yaya Callahan
// /*
// */


// class Conversation {

//   public static void main(String[] arguments) {

//     Scanner input = new Scanner(System.in);
//     System.out.print("How many rounds do you want to go? ");
//     int numRounds = input.nextInt();
//     System.out.println("Hello! What's on your mind?");

//     String[] toMirror = {"I", "me", "you", "am", "You"};
//     String[] replacements = {"You", "you", "me", "are", "I"};
//     String[] canned_responses = {"uh huh", "nope"};
//     //String[] punctuation = {"You", "you", "me", "are"};
   
//     boolean isReplaced = false;
//     boolean MirroredSentence = false;
//     Integer index_random = 0;
//     String canned = "";


//     //Strng []r = {""};
   
//     for (int i = 0; i < numRounds; i++) {
//       System.out.println(i);
//       Scanner sentence = new Scanner(System.in);
//       String ChatMessage = sentence.nextLine();
//       //String[] words = sentence.next().toWordArray();
//       //String ChatMessage = sentence.nextLine();
//       String[] response = new String[]{};
//       String[] words = ChatMessage.split(" ");

//       MirroredSentence = false;
//         for(int j = 0; j<words.length; j++){
            
//           response[j]+= words[j];
//           isReplaced = false;
//           for(int k = 0; k<toMirror.length; k++) {
//               if(words[j].equals(toMirror[k])){
                
//                 // System.out.println(words);
//                 response[j] = replacements[k];
//                 //System.out.println(response[j]);
//                 break;
//                 //r[i] = replacements[k];
//             }
//           } 

//           } 
          
//         } 
//         for(int k = 0; k<replacements.length; k++) {
//             List<String> responseIsList = Arrays.asList(response);

//           if (responseIsList.contains(replacements[k])){
//               //for if it was mirrored
//               for (int l = 0; l <= response.length; l++) {
//                   System.out.print(response[i] + " ");
//           }}
//           else {
//                 Random random = new Random();
//                 index_random = random.nextInt(2);
//                 canned += canned_responses[index_random];
//                 System.out.print(canned);

//                 } 
//             }
          
        

//         //if (r[i].equals("")) {r[i] = words[i];}
        
      
    

//     System.out.print("Goodbye");
//     input.close();


//   }
// }
