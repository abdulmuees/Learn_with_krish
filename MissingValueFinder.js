var array = [ 21,25,29,28,22,24,27,26,23 ];
array.sort()

var x,y,z;

for (let x = 0; x < array.length; x++) {
    y = array[x];
    z = array[x+1];
    if(y+1 != z){
        console.log(y+1);
        break;
    }
    else if((y+1 == z) && (x==array.length-1)){
        console.log(z+1);
    }
}