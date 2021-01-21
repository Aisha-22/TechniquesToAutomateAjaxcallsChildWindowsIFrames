TechniquesToAutomateAjaxcallsChildWindowsIFrames

**About the section:
*Mouse Click & Keyboard Event: Action Class in Selenium WebDriver

*Handling Ajax/Mouse Interactions
Building 'build()' the entire Actions string, and once built execute it, and ti execute it you need to give 'perform()'
>>Action class in Selenium webdrive
> Is a built-in feature provided by the selenium for handling keyboard and mouse events

//Create Actions Class to handle the MouseOver & keyboard interactions
Actions a = new Actions(driver); //Passing driver capabilities into the Actions
//Object 'a' has the interactions
//All Methods created for you to play with objects class
//Getting into building the entire action with '.build()' building a step, getting ready to execute and for it to be performed the operations test you need to conclude with the '.perform()' method
//Your just moving your mouse
a.moveToElement(driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"))).build().perform(); //Passing web element into the 'moveToElement

*Actions class-real time example
Slowly building multiple actions and making this step as composed action. (Concatenating all actions, and building the entire action, and performing it)

* Window Handle concepts-real time example
>To enter upperCase letters Keys.SHIFT Holding down the sift button, then select the upperCase word (How to select in Selenium)
>Right click on specific element, with the help og contextClick() ou can right click on specific element
>how to enter text in the text box .sendKeys();

*Working with child window*
>Steps to make you understand how to work with multiple windows 

*How to handle Frames*
>What is Frames and why there is a special way of handling Frames in Selenium webdriver
What is Frames?
In the context of a web browser, a frame is a part of a web page or browser window which displays content independent of its container, with the ability to load content independently.
> Frames are a component which are hosted on the web pages = that is independent of the HTML Code
> Whenever there is a frame such as placing a container in a box -> Selenium can not identify the frames -> If you see Frames you can not handle that in a normal function, 
you need to tell selenium that that is in frames so handle it accordingly you need to tell selenium that, if you dont it will this that this 'id' is a part of this web browser
> and it checks entire html code and you will not find it. 

**** Summary ****
>Handling special keyboard and mouse events are done using the AdvancedUserInteractions API.
> Frequently used Keyword and Mouse Events and doubleClick(), keyUp, dragAndDropBy, contextClick & sendKeys.

** Methods - Description **
> keyDown(textUsername, Keys.SHIFT).sendKeys(txtUsername, "hello") -> This will type "hello" in uppercase
> doubleClick(txtUsername) -> This will highlight the txt "HELLO"
> contextClick() -> This will bring up the context menue
> clickAndHold() -> Clicks (Without releasing) at the current mouse location

