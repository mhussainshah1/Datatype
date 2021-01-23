import java.io.*;
import java.math.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.prefs.*;
import java.util.regex.*;
import java.util.stream.*;
3 + 2
int cookies = 4;
double rewards = 3 + 2 * --cookies;
boolean isAnimalAsleep = false;
!isAnimalAsleep
double zooTemperature = 1.21;
zooTemperature = -zooTemperature
zooTemperature = -(-zooTemperature)
int pelican = !5;
boolean penguin = -true;
boolean peacock = !0;
int parkAttendance = 0;
++parkAttendance
parkAttendance
parkAttendance--
parkAttendance
int lion = 3;
int tiger = ++lion * 5 / lion--;
lion
int price = 2 * 5 + 3 * 4 - 8;
int price = 2 * ((5 + 3) * 4 - 8);
{long pigeon = 1+ ((3*5)/3;}
{int blueJay = (9+2) +3) / (2 * 4;}
short robin = 3 +[( 4 * 2) + 4];
9/3
9%3
10/3
10%3
11/3
11%3
12/3
12%3
-10%5
-11%5
-12%5
-13%5
-14%5
int x = 1;
long y =33;
var z = x * y;
{
    double x = 39.21;
    float y = 2.1;
    var z = x +y;
}
short x = 10;
short y = 3;
var z = x * y;
x = x * y
x = ++y
short w = 14;
float x = 13;
double = 30;
double y = 30;
var z = w * x / y;
int fur = (int) 5;
int hair = (short)2;
String type = (String) "Bird";
short tail = (short)(4 + 10);
int fur = 5;
int hair = 2;
String type = "Bird";
short tail = 4 + 10;
long feathers = 10(long);
float egg = 2.0 / 9;
int tadpole = (int)5 * 2L;
short = 3 - 2.0
int fish = 1.0;
short bird = 1921222;
int mammal = 9f;
long reptile  = 192301398193810323;
int fish = (int)1.0;
short bird = (short) 1921222;
int mammal = (int) 9f;
long reptile  = 192301398193810323L;
2147483647 + 1
Integer.MIN_VALUE
2147483647 + 2
byte b1 = -200;
short mouse = 10;
short hamster = 3;
short capybara = mouse * hamster;
short capybara = 10 * 3;
short capybara = mouse * hamster;
short capybara = (short) (mouse * hamster);
short gebril  = 1 + (short) (mouse * hamster);
long wolf =5;
long coyote = (wolf = 3);
wolf
boolean healthy = false;
if(healthy = true){
System.out.println("Good!");
}
if(healthy = true)
System.out.println("Good!");
5 == 5.0
true == true
true == false
String name1 = "sam";
String name2 = "sam";
name1 == name2
File monday = new File("schedule.txt");
File tuesday = new File("schedule.txt");
File wednesday = tuesday;
monday == tuesday
tuesday == wednesday
null == null
boolean monkey = true == 3;
boolean ape = false != "Grape";
boolean gorilla = 10.2 == "koko";
boolean bear =false;
boolean polar = (bear = true);
bear
int gibbonNumFeet = 2, wolfNumFeet = 4, ostrrichNumFeet = 2;
gibbonNumFeet < wolfNumFeet
gibbonNumFeet <= wolfNumFeet
gibbonNumFeet >= ostrrichNumFeet
gibbonNumFeet > ostrrichNumFeet
Integer zooTime = Integer.valueOf(9);
Number num = zooTime;
Integer zooTime = Integer.valueOf(9);
Number num = zooTime;
Object obj = zooTime;
public void openZoo(Number time){
    if(time instanceof Integer)
    System.out.println((Integer)time + " O' clock");
    else
    System.out.println(time);
}
openZoo(5)
openZoo(5.0f)
openZoo(5.0)
public void openZoo(Number time){
    if(time instanceof String)
        System.out.println((Integer)time + " O' clock");
    else
        System.out.println(time);
}
null instanceof Object
Object instanceof null
boolean eyesClosed = true;
boolean breathingSlowly = true;
boolean resting = eyesClosed | breathingSlowly;
boolean asleep = eyesClosed & breathingSlowly;
boolean awake = eyesClosed ^ breathingSlowly;
int hour = 10;
boolean zooOpen = true || ( hour < 4);
class Animal{
    private int age;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
Animal duck;
if (duck!=null & duck.getAge()<5){
    System.out.println("Hi");
}
if (duck!=null && duck.getAge()<5){
    System.out.println("Hi");
}
int rabbit = 6;
boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
rabbit
boolean bunny = (rabbit >= 6) | (++rabbit <= 7);
rabbit
int owl = 5;
int food;
if(owl<2){
    food = 3;
} else {
    food =4;
}
food
int food = owl < 2 ? 3 : 4;
int food = (owl < 2) ? 3 : 4;
int stripes = 7;
(stripes > 5 ) ? 21 : "Zebra"
int animal = (stripes < 9) ? 3 : "Horse";
int sheep = 1 , zzz = 1;
int sleep = zzz<10 ? sheep++ : zzz++;
sheep +","+zzz
int sheep = 1 , zzz = 1;
int sleep = zzz>=10 ? sheep++ : zzz++;
sheep +","+zzz