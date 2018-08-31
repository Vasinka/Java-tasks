import java.io.BufferedReader;

import java.io.DataInputStream;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.ArrayList;

import java.util.List;

import java.util.StringTokenizer;

 

public class ExtractAllUniqueWords {

 

               public List<String> getDistinctWordList(String fileName) {

 

                              FileInputStream fis = null;

                              DataInputStream dis = null;

                              BufferedReader br = null;

                              List<String> wordList = new ArrayList<String>();

                              try {

                                             int flag;

                                             fis = new FileInputStream(fileName);

                                             dis = new DataInputStream(fis);

                                             br = new BufferedReader(new InputStreamReader(dis));

                                             String line = null;

                                             while ((line = br.readLine()) != null) {

                                                            flag = 1;

                                                            StringTokenizer st = new StringTokenizer(line, " ,.;:\"");

                                                            while (st.hasMoreTokens()) {

                                                                           String tmp = st.nextToken().toLowerCase();

 

                                                                           if (!wordList.contains(tmp)) {

                                                                                          wordList.add(tmp);

                                                                                          flag = 0;

                                                                           } else

                                                                                          flag = 1;

                                                                           if (wordList.contains(tmp) && flag == 1) {

                                                                                          wordList.remove(tmp);

                                                                           }

 

                                                            }

                                             }

                              } catch (FileNotFoundException e) {

                                             e.printStackTrace();

                              } catch (IOException e) {

                                             e.printStackTrace();

                              } finally {

                                             try {

                                                            if (br != null)

                                                                           br.close();

                                             } catch (Exception ex) {

                                             }

                              }

                              return wordList;

               }

 

               public static void main(String args[]) {

 

                              ExtractAllUniqueWords distFw = new ExtractAllUniqueWords();

                              List<String> wordList = distFw.getDistinctWordList("C:/Temp/unique.txt");

                              for (String str : wordList) {

                                             System.out.println(str);

                              }

               }

}

