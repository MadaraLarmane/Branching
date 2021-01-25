package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        //Task number1

     short a = 12345;
     short b = 543;
     if (a > b){
            System.out.println("a is the largest number");
            System.out.println("b is the smallest number");}
     else {
            System.out.println("b is the largest number");
            System.out.println("a is the smallest number");}
     if (a == b) {
            System.out.println("a and b are equals"); }
     else {
            System.out.println("a and b are not equals"); }
     if ((a%2==0) || (b%2==0)){
            System.out.println("There are even numbers"); }
     else{
            System.out.println("There are odd numbers"); }
     if (a < 0 || b < 0) {
            System.out.println("There are negative numbers"); }
     else {
            System.out.println("There are positive numbers"); }
     if (a < 100 || b < 100) {
            System.out.println("There are numbers which are less than 100"); }
     else {
            System.out.println("There are no numbers which are less than 100"); }

        //Task number2

        int time = 5;
        if (time < 0 || time > 24){
            System.out.println("You have chosen the wrong time!"); }
        else{
            System.out.println("."); }
        if (time < 12) {
            System.out.println("Good Morning Sunshine!"); }
        else {
            System.out.println("."); }
        if ((time >= 13) && (time <= 19)) {
            System.out.println("Good Afternoon. Work Hard!"); }
        else {
            System.out.println("."); }
        if ((time >= 20) && (time <= 24)) {
            System.out.println("Good Evening. Get some rest!"); }
        else {
            System.out.println("."); }

        //Task number3

        Scanner input = new Scanner(System.in);
        System.out.println("Please write the day:");
        System.out.println("Please write the month:");
        System.out.println("Please write the year:");
        System.out.println("Please select the date formatting. 1 - YYYY/MM/DD, 2 - YYYY.MM.DD.");
       int day = input.nextInt();
       int month = input.nextInt();
       int year = input.nextInt();
       int dateFormat = input.nextInt();
       if ((day < 1 || day > 31) || (month < 1 || month > 12) || (year < 1 || year > 2021)) {
          System.out.println("Something is wrong. Please check chosen day, month and year. Try again!"); }
        else if (dateFormat == 1) {
            System.out.println(year+"/"+month+"/"+day); }
       else if (dateFormat == 2) {
          System.out.println(year+"."+month+"."+day+"."); }
        else {
           System.out.println("Please choose numbers 1 or 2 to select date format!"); }

        // Task number 4
        Scanner input = new Scanner(System.in);
        System.out.println("Please write day number of the year!");
        int monthOfYear = input.nextInt();
        System.out.println("The day number is:"+monthOfYear);
        if (monthOfYear < 1 || monthOfYear > 365){
            System.out.println("Wrong day number of the year. Choose different number!"); }
            else if (monthOfYear >= 1 && monthOfYear <= 31){
                System.out.println("It is: January"); }
            else if (monthOfYear >= 32 && monthOfYear <= 59){
                System.out.println("It is: February"); }
            else if (monthOfYear >= 60 && monthOfYear <= 90){
                System.out.println("It is: March"); }
            else if (monthOfYear >= 91 && monthOfYear <= 120){
                System.out.println("It is: April"); }
            else if (monthOfYear >= 121 && monthOfYear <= 151){
                System.out.println("It is: May"); }
            else if (monthOfYear >= 152 && monthOfYear <= 181){
                System.out.println("It is: June"); }
            else if (monthOfYear >= 182 && monthOfYear <= 212){
                System.out.println("It is: July"); }
            else if (monthOfYear >= 213 && monthOfYear <= 243){
                System.out.println("It is: August"); }
            else if (monthOfYear >= 244 && monthOfYear <= 273){
                System.out.println("It is: September"); }
            else if (monthOfYear >= 274 && monthOfYear <= 304){
                System.out.println("It is: October"); }
            else if (monthOfYear >= 305 && monthOfYear <= 334){
                System.out.println("It is: November"); }
            else if (monthOfYear >= 335 && monthOfYear <= 365){
                System.out.println("It is: December"); }

        //Task number 5

        Scanner input = new Scanner(System.in);
        System.out.println("Please write your working hours:");
        int workingHoursInDay = input.nextInt();
        if (workingHoursInDay < 0 || workingHoursInDay > 24){
            System.out.println("Wrong working hours! Choose different number!"); }
        else if (workingHoursInDay > 8){
            int salary = 80 + (workingHoursInDay-8)*15;
            System.out.println("Your salary will be: "+ salary); }
        else{
             int salary = workingHoursInDay*10;
             System.out.println("Your salary will be: "+salary); }

}}


