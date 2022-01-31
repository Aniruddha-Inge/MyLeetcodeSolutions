class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        
 return (v(p1,p2,p3,p4)||v(p1,p2,p4,p3)||v(p1,p3,p2,p4)||v(p1,p3,p4,p2)||v(p1,p4,p2,p3)||v(p1,p4,p3,p2));    
    }

public boolean v(int [] p1, int [] p2, int [] p3, int [] p4){
    
    int p12 = dist(p1, p2);   
    int p13 = dist(p1, p3);      
    int p14 = dist(p1, p4);   
    int p23 = dist(p2, p3);   
    int p24 = dist(p2, p4);   
    int p34 = dist(p3, p4);         


    return (p14 != p12)&&(p12 == p13)&&(p14 == 2*p12)&&(p23 == 2*p24)&&(p34 == p24);
}   

public int dist(int [] p1, int [] p2){
    
    return((p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[1]-p2[1]));
 
} 
}