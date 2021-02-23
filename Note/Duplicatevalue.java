public class Duplicatevalue{

public static void main(String[] args){

String str="sitaramaraju";

char ch='a';

int count=0;

for(int i=0;i<str.length();i++){

if(ch==str.charAt(i)){

++count;

}


}
System.out.println(ch+ " is repeated " +count);

}


}