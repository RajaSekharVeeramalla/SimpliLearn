package project3;

import java.util.Scanner;
//custom exception
class UnderAgeException extends Exception{
public String toString() {
    return "Under age";
}
}
class OverAgeException extends Exception{
public String toString1() {
    return "Over age";
}
}

class Applicant{
int age;

void collectData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age:");
    age = sc.nextInt();
    
}
void verify() throws UnderAgeException, OverAgeException{
    if(age>18 && age<65) {
        System.out.println("Give License");
    }
    else if(age<18){
    	UnderAgeException uae = new UnderAgeException();
        System.out.println(uae.toString());
        throw uae;
    }
    else {
    	OverAgeException oae = new OverAgeException();
        System.out.println(oae.toString1());
        throw oae;
    }
}
}



class License{
void customerCheck() throws OverAgeException {
    Applicant c1 = new Applicant();
    c1.collectData();
    try {
    c1.verify();
    }
    catch (UnderAgeException e) {
        // TODO: handle exception
        System.out.println(e.toString());
    }
}
}
public class MyClass4 
{
public static void main(String args[]) throws ArrayIndexOutOfBoundsException, OverAgeException
{
    License b = new License();
    b.customerCheck();
}
}