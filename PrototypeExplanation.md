<img src="C:\Users\Zack_\Desktop\team202101\Prototype\Prototype\loginPage\InitialPage.png" alt="InitialPage" style="zoom:25%;" />

**Scene**: *Scene00_initialPage*

**Scene Explanation**: The above scene is shown when the applet is opened from WeChat

**Scene Before**: *NONE*

**Scene After**: 

- *Scene01_signIn*, click "Sign in" button to sign in and would jump to it.
- *Scene05_signUp*, click "Sign up" button to sign up and would jump to it.











<img src="C:\Users\Zack_\Desktop\team202101\Prototype\Prototype\loginPage\signIn\signIn1.PNG" alt="signIn1" style="zoom:25%;" />

**Scene**: *Scene01_signIn*

**Scene Explanation**: This scene allows user to sign in the applet

**Scene Before**: *Scene00_initialPage*

**Scene After**: 

- *Scene02_signIn_forgetPassword*, click "Forget Password" to reset password and would jump to it

- *Scene05_signUp*, click "Sign up" button to sign up and would jump to it.

**Notes**: here, click EYE sign would show the hidden password





<img src="C:\Users\Zack_\Desktop\team202101\Prototype\Prototype\loginPage\signIn\signInForgetPassword.PNG" alt="signInForgetPassword" style="zoom:25%;" />

**Scene**: *Scene02_signIn_forgetPassword* 

**Scene Explanation**: The above scene is shown when user forgets its password and want to reset it with phone number validation

**Scene Before**: *Scene01_signIn*

**Scene After**: *Scene03_signIn_authorityCode* , click "SMS verification code" to send message to the phone and would jump to scene03 for verification.

**Notes**: here, click "+86" would allow you to choose region you are from.



<img src="C:\Users\Zack_\Desktop\team202101\Prototype\Prototype\loginPage\signIn\signInAuthorityCode.PNG" alt="signInAuthorityCode" style="zoom:25%;" />

**Scene**: *Scene03_signIn_authorityCode* 

**Scene Explanation**: The above scene is to verify phone number by input authentication code

**Scene Before**:  *Scene02_signIn_forgetPassword*

**Scene After**: *Scene04_signIn_setNewPassword*, once code is validated, jump to that scene 





<img src="C:\Users\Zack_\Desktop\team202101\Prototype\Prototype\loginPage\signIn\signInSetNewPassword.PNG" alt="signInSetNewPassword" style="zoom:25%;" />

**Scene**: *Scene04_signIn_setNewPassword*  

**Scene Explanation**: The above scene allows user to input new password

**Scene Before**: *Scene03_signIn_authorityCode* 

**Scene After**: *Scene01_signIn*, if the input password is in valid form, it would jump back to sign in page





<img src="C:\Users\Zack_\Desktop\team202101\Prototype\Prototype\loginPage\signUp\signUp1.PNG" alt="signUp1" style="zoom:25%;" />

**Scene**: *Scene05_signUp*

**Scene Explanation**: The above scene is to let user sign up an account with its phone number

**Scene Before**: *Scene00_initialPage*

**Scene After**: 

- *Scene06_signUp_chooseRegion*, if click "+86" to choose region

- *Scene07_signUp_authorityCode*, if input valid phone number to sign up an account and click "SMS verification code" button to verify the number 



<img src="C:\Users\Zack_\Desktop\team202101\Prototype\Prototype\loginPage\signUp\signUp2ChoosePhoneNumber.PNG" alt="signUp2ChoosePhoneNumber" style="zoom:25%;" />

**Scene**: *Scene06_signUp_chooseRegion*

**Scene Explanation**: The above scene is shown when the user click "+86" button from *Scene05_signUp*

**Scene Before**: *Scene05_signUp*

**Scene After**: *Scene05_signUp*, choose a region and would jump back to that scene



<img src="C:\Users\Zack_\Desktop\team202101\Prototype\Prototype\loginPage\signUp\signUpAuthorityCode.PNG" alt="signUpAuthorityCode" style="zoom:25%;" />

**Scene**: *Scene07_signUp_authorityCode*

**Scene Explanation**: The above scene is to let user verify its phone number with authentication code

**Scene Before**: *Scene05_signUp*

**Scene After**: *Scene08_signUp_setPassword*, if the authentication code is valid it would jump to that scene



<img src="C:\Users\Zack_\Desktop\team202101\Prototype\Prototype\FourUsers\ProjectManagement\Dashboard.PNG" alt="Dashboard" style="zoom:25%;" />



**Scene**: *Scene08_dashBoard*

**Scene Explanation**: The above scene is displayed when project manager signed in

**Scene Before**: *Scene01_signIn*

**Scene After**: 

- *Scene09_projectTable*, click the project button at bottom and jump to view the project table
- Scene _messageTable, click the message button at bottom and jump to view the message table
- Scene _moreInfo, 
- Scene _application



<img src="C:\Users\Zack_\Desktop\team202101\Prototype\Prototype\FourUsers\ProjectManagement\InitialPageofPM.png" alt="InitialPageofPM" style="zoom:25%;" />

**Scene**: *Scene09_projectTable*

**Scene Explanation**: All the projects managed by the manager are listed here.

**Scene Before**: *Scene01_signIn*

**Scene After**: 

- *Scene10_createProject*, click "+" at right upper corner to create a new project and jump to that scene
- *Scene11_projectInfo*, click specific project in the table and would jump to the specific project's info page



<img src="C:\Users\Zack_\Desktop\team202101\Prototype\Prototype\FourUsers\ProjectManagement\CreateProject.png" alt="CreateProject" style="zoom:25%;" />

**Scene**: *Scene10_createProject*

**Scene Explanation**: Project can be created here with specific template, name, description, visibility and add relevant member

**Scene Before**: *Scene09_projectTable*

**Scene After**: *Scene09_projectTable*, after creation, jump back to project list



<img src="C:\Users\Zack_\Desktop\team202101\Prototype\Prototype\FourUsers\ProjectManagement\PeojectInformationForPM.png" alt="PeojectInformationForPM" style="zoom:25%;" />

**Scene**: *Scene11_projectInfo*

**Scene Explanation**: Project specific information could be view in this page, which includes start/end time, description, current state, and pie diagram which shows the percentage of completed, delayed tasks.

**Scene Before**: *Scene09_projectTable*

**Scene After**: 

- *Scene09_projectTable*, click "Back" would jump back to project table.
- *Scene12_selectProjectStage*, click "Current stage" would allow user to set current task stage.
- *Scene13_selectStartEndTime*, click "Start time" or "End time" would jump to this sceen.



<img src="C:\Users\Zack_\Desktop\team202101\Prototype\Prototype\FourUsers\ProjectManagement\SelectProjectStage.png" alt="SelectProjectStage" style="zoom:25%;" />

**Scene**: *Scene12_selectProjectStage*

**Scene Explanation**: Project manager could choose the project current stage at this scene

**Scene Before**: *Scene11_projectInfo*

**Scene After**: *Scene11_projectInfo*, after select a stage, jump back to last page 



<img src="C:\Users\Zack_\Desktop\team202101\Prototype\Prototype\FourUsers\ProjectManagement\SelectProjectStart&EndDate.PNG" alt="SelectProjectStart&EndDate" style="zoom:25%;" />

**Scene**: *Scene13_selectStartEndTime*

**Scene Explanation**: Project manager could modify the start time and end time of the project

**Scene Before**: *Scene11_projectInfo*

**Scene After**: *Scene11_projectInfo*, after modify the date, jump back to last page 

