package project.test;

import org.junit.Test;
import project.CharacterComparator;
import project.OffByN;
import project.OffByOne;

import static org.junit.Assert.*;

public class TestOffByOne {

    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.
    static CharacterComparator offByOne = new OffByOne();

    // Your tests go here.
    @Test
    public void testequalChars(){
        OffByOne obo = new OffByOne();
        obo.equalChars('a','b');
        obo.equalChars('r', 'q');
        obo.equalChars('a', 'e');
        obo.equalChars('z', 'a');
        obo.equalChars('a', 'a');
        OffByN o = new OffByN(5);
        o.equalChars('a', 'f');  // true
        o.equalChars('f', 'a');  // true
        o.equalChars('f', 'h');  // false
    }
    //Uncomment this class once you've created your CharacterComparator interface and OffByOne class. **/
}
