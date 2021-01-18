TechniquesToAutomateAjaxcallsChildWindowsIFrames

**About the section:

*Handling Ajax/Mouse Interactions
Building 'build()' the entire Actions string, and once built execute it, and ti execute it you need to give 'perform()'
>>Action class in Selenium webdrive
>

//Create Actions Class to handle the MouseOver & keyboard interactions
Actions a = new Actions(driver); //Passing driver capabilities into the Actions
//Object 'a' has the interactions
//All Methods created for you to play with objects class
//Getting into building the entire action with '.build()' building a step, getting ready to execute and for it to be perform the operations test you need to conclude with the '.perform()' method
//Your just moving your mouse
a.moveToElement(driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"))).build().perform(); //Passing web element into the 'moveToElement

*Actions class-real time example
Slowly building multiple actions and making this step as composed action. (Concatenating all actions, and building the entire action, and performing it)

* Window Handle concepts-real time example
>To enter upperCase letters Keys.SHIFT Holding down the sift button, then select the upperCase word (How to select in Selenium)
>Right click on specific element, with the help og contextClick() ou can right click on specific element
>