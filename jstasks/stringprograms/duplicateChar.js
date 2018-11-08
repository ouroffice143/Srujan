/*
program to find out the duplicate charecter in a string
logic: convert the string to charecter array 
comapare the string
*/
var str="My name is srujans";
//declaring charecter array
var ch=[],j=0;
var count=0;
//assigning the string values to the charecter array
for(var i=0;i<str.length;i++){
    if(str.charAt(i)!=' '){
        ch[j]=str.charAt(i);
        j++;
    }
}

//logic to find the charecter array
for(i=0;i<ch.length;i++){
    for(j=0;j<ch.length;j++){
        if(i>j){
            if(ch[i]==ch[j]&&i!=j){
                break;
            }
        }
        else{
            if(ch[i]==ch[j]&&i!=j){
                count++;
               
            }
        }
        
    }
    if(count>0){
        console.log(ch[i]+' is the duplicate element'+count);
    }
    count=0;
}