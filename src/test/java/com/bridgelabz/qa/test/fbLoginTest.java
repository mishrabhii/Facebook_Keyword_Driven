package com.bridgelabz.qa.test;

import com.bridgelabz.BaseClass.BaseClass;
import com.bridgelabz.keywordEngine.KeywordEngine;
import org.testng.annotations.Test;

public class fbLoginTest  {

    @Test
    public void loginToFb() {
        KeywordEngine ke = new KeywordEngine();
        ke.start_Execution("Sheet1");
    }
}
