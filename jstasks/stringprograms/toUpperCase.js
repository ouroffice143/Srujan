/**
 * program to convert the string to uppercase
 * checking the ascii code so that we can convert         
 * 
 */

 //declaring a variable
 var str="My name is Srujan";
//creating capitalize function
 let capital=function(s){
     for(i=0;i<s.length;i++){
        var letter=s.charCodeAt(i);
        console.log(s.charAt(i));
        if(letter>= 97 && letter<= 122){
           
          return String.fromCharCode(letter-32)+s.substr(i);
           
        }
        return s;
     }
    
 }
 console.log(capital(str));