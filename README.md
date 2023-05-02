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
   

- **2. Login only inpputting invalid password**
	- **Test Step**
	   >1. Launch the application
	   >2. Tap LOG IN OR REGISTER in welcome page
	   >3. Input password does not meet the requirements 
	   >4. Tap LOG IN
      - **Expected : Will display an error message "Please enter an email address., Password must be at least 8 characters, and contain both letters and numbers., and Password must be 8 – 20 letters, and contain both letters and numbers; optionally symbols shown here can be used: - _ . @"**

- **3. Login only inputting valid password**
	- **Test Step**
	   >1. Launch the application
	   >2. Tap LOG IN OR REGISTER in welcome page
	   >3. Input password according to requirements
	   >4. Tap LOG IN
	  - **Expected : Will display an error message "Please enter an email address."**

 4. **4. Login without entering email and password**
	- **Test Step**
	   >1. Launch the application
	   >2. Tap LOG IN OR REGISTER in welcome page
	   >3. Input password according to requirements
	   >4. Tap LOG IN
	  - **Expected : Will display an error message "Please enter an email address., Please enter a password., and Password must be at least 8 characters, and contain both letters and numbers."**

## Screen Record
<img src="https://user-images.githubusercontent.com/42727156/227218971-49909bea-ae57-4c44-b7f7-d68aab03a8c8.mp4" width="50%">



## Reporting

for reporting [Allure Report](https://swaglabs.netlify.app/#), check this.
