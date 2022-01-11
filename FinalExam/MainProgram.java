package finalExam;

import java.io.*;

public class MainProgram {

   static CD cdArr[] = new CD[100];
   static MP3 mp3Arr[] = new MP3[100];
   static VinylAlbum vinArr[] = new VinylAlbum[100];
   static int noOfEleCd = 0;
   static int noOfEleMp3 = 0;
   static int noOfEleVin = 0;

   //Function to read text file and generate report
   static void readFile(String fileName) {

       File file = new File(fileName);

       BufferedReader br = null;
       try {
           br = new BufferedReader(new FileReader(file));
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }

       String st;
       String tempSplit[] = new String[7];
       try {
           System.out.println("\t\t\t File Report");
           System.out.println("\t\t\t -----------");
           System.out.println("Music Id Item Name Quantity Price Format Length Special Order");
           while ((st = br.readLine()) != null) {
               tempSplit = st.split(" ");
               System.out.println(tempSplit[0]+"\t   "+tempSplit[1]+" \t"+tempSplit[2]+"\t"+tempSplit[3]
                       +"\t"+tempSplit[4]+"\t"+tempSplit[5]+"\t"+tempSplit[6]);
               if (tempSplit[0].charAt(0) == 'C') {
                   cdArr[noOfEleCd] = new CD(tempSplit[0], tempSplit[1], Integer.valueOf(tempSplit[2]),
                           Double.valueOf(tempSplit[3]), Integer.valueOf(tempSplit[4]), Integer.valueOf(tempSplit[5]),
                           Boolean.valueOf(tempSplit[6]));
                   noOfEleCd++;
               } else if (tempSplit[0].charAt(0) == 'M') {
                   mp3Arr[noOfEleMp3] = new MP3(tempSplit[0], tempSplit[1], Integer.valueOf(tempSplit[2]),
                           Double.valueOf(tempSplit[3]), Integer.valueOf(tempSplit[4]), Integer.valueOf(tempSplit[5]),
                           Boolean.valueOf(tempSplit[6]));
                   noOfEleMp3++;
               }
              
           }
           System.out.println();
       } catch (IOException e) {
           e.printStackTrace();
       }

   }

   // Function to search by ID
   static Music searchM(String mId) {
       if (mId.charAt(0) == 'C') {
           for (int i = 0; i < noOfEleCd; i++) {
               if (mId.equals(cdArr[i].getMusicID())) {
                   return cdArr[i];
               }
           }
       } else if (mId.charAt(0) == 'M') {
           for (int i = 0; i < noOfEleMp3; i++) {
               if (mId.equals(mp3Arr[i].getMusicID())) {
                   return mp3Arr[i];
               }
           }
       }

       System.out.println("Item Not Found! Error!");
       return null;
   }

   public static void main(String[] args) {
      
       String fileName = "myMediaPlayList.txt";
      
       // Generates report
       readFile(fileName);
      
       // Search by ID
       System.out.println(searchM("MP3_1").toString());
       System.out.println(searchM("CD_2").toString());
   }

}