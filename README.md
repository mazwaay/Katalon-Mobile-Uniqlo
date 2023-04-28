# Hi, I'm Mazway 👋

I will create a simple automation test using Katalon studio for [Uniqlo ID](https://play.google.com/store/apps/details?id=com.uniqlo.id.catalogue&hl=in&gl=US).

## Installation

- Clone this project
- Install Katalon studio

## Scenario Test

 - **1. Login only inputting email**
	- **Test Step**
	   >1. Launch the application
	   >2. Tap LOG IN OR REGISTER in welcome page
	   >3. Input email address
	   >4. Tap LOG IN
	  - **Expected : Will display an error message "Please enter a password." and "Password must be at least 8 characters, and contain both letters and numbers."**
   

- **2. Login using locked user**
	- **Test Step**
	   >1. Open the website
	   >2. Input username as locked_out_user
	   >3. Input password as secret_sauce
	   >4. Click button login
      - **Expected : Will display an error message "Epic sadface: Sorry, this user has been locked out."**

- **3. Login using problem user**
	- **Test Step**
	   >1. Open the website
	   >2. Input username as problem_user
	   >3. Input password as secret_sauce
	   >4. Click button login
	  - **Expected : Successfully logged in but an inappropriate image is displayed.**

 4. **4. Login using performance user**
	- Test Step
	   >1. Open the website
	   >2. Input username as performance_glitch_user
	   >3. Input password as secret_sauce
	   >4. Click button login
	  - **Expected : Login is successful but it takes a longer time.**

## Screen Record
<img src="https://user-images.githubusercontent.com/42727156/227218971-49909bea-ae57-4c44-b7f7-d68aab03a8c8.mp4" width="50%">


## Reporting

for reporting [Allure Report](https://swaglabs.netlify.app/#), check this.
