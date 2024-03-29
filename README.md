## Exercise: LetterSize (4 Points)

The project name of this exercise is **LetterSize**.

The purpose of this assignment is for you to write more of your own comments, use fundamental data types, and to use constants in your program.

### Problem Description

This problem is in the book as P2.1 (page 71, in the _Late Objects_ version). 

Write a program that displays the dimensions of a letter-size (8.5 × 11 inches) sheet of paper in millimeters. Be sure to print it out so that there are two numbers after the decimal point for the conversions. There are 25.4 millimeters per inch. Use constants and comments in your program. 

_Hint_: When using `String.format` the format specifier for two digits is listed on page 50 in Big Java Late Objects (149 for Early Objects) of the book. The function there is called `printf`, but the format specifiers are the same. `String.format` returns a formatted string and `printf` sends a formatted string to the console.

### Getting Started

Like our last exercise, we are going to start by creating **LetterSize.java**. Using the techniques shown on the web page titled [How to Start Every Project in this Class](http://209.129.49.15:7990/projects/CS105/repos/allan.knight/browse/HowToStartEveryProject.md) create a source file called **LetterSize.java**.

**LetterSize.java** is where your source code will go. Replace the code in that file with the code in the grey box below:

```java
/**
 * CS 105 Theory & Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: LetterSize
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
package edu.sbcc.cs105;

/**
 * This class tests the LetterSize object.
 *
 */
public class LetterSize {

    /**
     * Write source code to calculate the size of an 8.5 x 11 inch letter in millimeters.
     */
    public static String computeLetterSize() {
        // Put your code here.
    }
    
    public static void main(String[] args) {
		System.out.println(computeLetterSize());
    }
}
```

Now go through **LetterSize.java** and change the [CHANGE THIS TO YOUR INFORMATION] text to the proper items. There are two items to be changed. The CRN # section number of the class. Each lab time, for the Thu. night , or for the Thu. morning lab section, has a different section number.

Next, write your code that creates a string with the computed letter size  in `public static String computeLetterSize` between the curly braces.

Once you've written your code run the code by single clicking on LetterSize.java in the package explorer and selecting **Run->Run** from the menu or using the keyboard shortcut. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

### How to turn in this exercise

The first step of turning in your code is to commit and push your code to BitBucket. Once you've completed this step your code will be on BitBucket in your repository, not the repository for the class. This will allow you to use all your projects later as a portfolio.

To start the process write click your project and select **Team -> Commit...**. You should see the following dialog:

![Commit dialogue](https://www.dropbox.com/s/lojod76ghyzl626/commit-git.png?dl=1)

Now follow these steps to commit and push your code:

1. Select the files by check marking the files you want to commit. In this case **LetterSize.java**. 
2. Enter a commit message. The commit message can be anything, but should describe the changes that are begin committed. A good commit message in this case might be "Committing code to check in for assignment"
3. Press **Commit and Push**

You will see a few more dialogs (including ones that may ask for your BitBucket username and password) go by and then you will see something similar to the following:

![Push dialogue](https://www.dropbox.com/s/niao32p4abbx4k2/push-git.png?dl=1)

1. Push **OK** to complete the commit. You may get no confirmation, but you can check BitBucket to see if the code now exists there.

#### Completing the turn-in process

Now to complete the turn-in process, once you confirmed that your code is on BitBucket, you need to create a **pull request** in the class BitBucket repository. This action will indicate to the original project that you have finished your coding and it will create a place to give feedback on a line by line basis. 

Go to **your** repository or the repository for this assignment on BitBucket (the project you forked from to create your project).

<img src="https://www.dropbox.com/s/p40wg00a72khhpv/create-pull-request.png?dl=1" width="207" height="207" />

1\. Click on the **Create pull request** icon. 

You should see something similar to this picture:


<img src="https://www.dropbox.com/s/rrgmvpc9wtfjqrr/pull-request-screen-first.png?dl=1" width="600" height="250" />

The next screen then shows the source and destination of the pull request. Your code is the source and is listed at the top. The destination is the original project that you forked from. The only thing to do on this screen is to select the **master** branch for your project. Once you select **Select Branch**, as directed below, you should see the following:

<img src="https://www.dropbox.com/s/r9cmia1ixppglko/pull-request-master.png?dl=1" width="600" height="250" />

2\. Select **Select Branch** you should see something like this:

3\. Select **master** 

4\. Press the **Continue** button.

Once you've followed these steps you should see this at the top:

<img src="https://www.dropbox.com/s/mglhiaeqd2qn72p/pull-request-description.png?dl=1" width="514" height="325" />

5\. Under **Title**, give the pull request a meaningful title. It's mostly for your benefit.

6\. Under **Description**, describe the purpose of this pull request. Usually it's just to submit the assignment. However, you can also use this field to let me know anything that might be wrong or different with your code.

7\. Finally, click on **Create**

After selecting **Create**, you code should build and be tested within a minute or so. If the test is successful you will see something similar to the following screen:

<img src="https://www.dropbox.com/s/sy4c82pi4glk5pu/pull-request-submitted.png?dl=1" width="740" height="350" />

Notice the part on the right hand of the screen that says **3 builds**. If the icon is green your good, if it failed, it will be red. **Note** This one says 3 builds, it might say another number. The important thing is whether it is green or red.

This final action "_turns_" in the assignment on BitBucket. It also causes your code to be unit tested on a separate server. The result should be exactly the same as when you ran it on your computer.

After grading the exercise, the pull request will be closed without merging back into the original project. This is the normal workflow and does not represent any problem with your code.

