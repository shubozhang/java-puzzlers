package com.guava.g01basicutilities;

import static com.google.common.base.Preconditions.*;

public class G02Preconditions {

    public static void main(String[] args) {

        testPreconditions();
    }

    private static void testPreconditions() {

        checkArgument(true);

        String str = "";
        checkNotNull(str);

        int index = 8;
        checkElementIndex(index,10);

        checkPositionIndex(index, 10);

        checkPositionIndexes(3, index, 10);
    }
}
