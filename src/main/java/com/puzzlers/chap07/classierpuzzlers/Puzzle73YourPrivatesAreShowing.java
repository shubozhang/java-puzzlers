package com.puzzlers.chap07.classierpuzzlers;

import com.puzzlers.util.Api;

/**
 * 1. private members are fully encapsulated by the class that contains them.
 *
 * 2. serialization can break this encapsulation. Making a class serializable and accepting the default
 *    serialized form causes the class’s private instance fields to become part of its exported API
 *
 * 3. Reusing names is dangerous; avoid hiding, shadowing, and obscuring.
 */
public class Puzzle73YourPrivatesAreShowing {

    int answer = Api.ANSWER;
}
