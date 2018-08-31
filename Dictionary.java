package dictionary;

 

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;

import java.util.Scanner;

 

public class GermanDictionary {

 

               private static Scanner input;

 

               private static Properties loadDictionaryData() {

                              FileInputStream in = null;

                              Properties words = new Properties();

                              try {

 

                                             in = new FileInputStream(new File("Dictionary.properties"));

                                             words.load(in);

                                             in.close();

 

                              }

 

                              catch (IOException e) {

                                             e.printStackTrace();

                              }

 

                              finally {

                                             if (in != null) {

                                                            try {

                                                                           in.close();

                                                            } catch (IOException e) {

 

                                                                           e.printStackTrace();

                                                            }

                                             }

                              }

                              return words;

               }

 

               public static void main(String[] args) {

 

                              Properties dictionary = loadDictionaryData();

                              input = new Scanner(System.in);

                              do {

                                             String word = input.nextLine();

 

                                             if (word.equals("exit")) {

                                                            break;

                                             }

 

                                             if (dictionary.containsKey(word) == true) {

                                                            System.out.println(dictionary.getProperty(word));

 

                                             }

 

                                             else

                                                            System.out.println("Word not found.");

                              }

 

                              while (true);

 

               }

 

}
