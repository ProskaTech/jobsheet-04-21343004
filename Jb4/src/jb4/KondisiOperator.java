/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb4;

/**
 *
 * @Creater by zahra 21343004
 */
public class KondisiOperator {
   public static void main(String[]args){
       String status = "";
       int grade = 50;
       
       //mendapatkan status pelajar
       status = (grade >= 60) ? "Passed" : "Fail";
       
       //print status
       System.out.println(status);
       
   } 
}
