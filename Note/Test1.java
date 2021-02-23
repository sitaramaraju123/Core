class Test1{

public static void main(String[] args){

int num[]={2000,2003,2020,2004,1900};

for(int i=0;i<num.length;i++){

if((num[i]%4==0) && (num[i]%100!=0) || (num[i]%400==0)){

System.out.println(num[i]);

}

}


}


}