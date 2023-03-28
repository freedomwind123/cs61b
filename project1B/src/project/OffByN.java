package project;

public class OffByN implements CharacterComparator{
    public int num;
    public OffByN(int N){
        num = N;
    }
    public boolean equalChars(char x, char y){
        return Math.abs(x - y) == num;
    }
}
