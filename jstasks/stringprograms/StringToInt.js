/*program to convert Integer to string and string to integer*/
var a=10;
var str='123';
var conInt=0;
var t=[];
//convertion of String to integer
for(i=0;i<str.length;i++){
    t[i]=str.charAt(i);
}
    
    for(i=0;i<str.length;i++){
        conInt=conInt+t[i];
    }

console.log(t);
console.log(conInt+5);