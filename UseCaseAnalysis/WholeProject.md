## Functional requirements

***Log-in part***

1. User should be able to reset its account when he forget his/her password.
2. System should send a piece of verification code to validate if it is the owner of the account that is changing password.
3. System should verify password and if it is wrong, login error should be displayed.
4. System should detect whether it is a house-owner, manager, worker, admin or material manager account and show according page.
5. System should allow user to sign up an account through binding phone number.



***Admin***

 	1. Administrator should be able to see the overview of all the ongoing project of the company, where overview should include start time, expected duration, project manager and current stage.
 	2. Administrator should be able to view detailed information of a specific project when clicked in, where detailed information should include project manager, current stage, start time, end time, priority, tag, participant list, description of the project and subtask.
 	3. Administrator should be able to view the list of all the current idle working team / project manger.



***House owner***

1. House owner should be able to View the whole project progress in Kanban or Task Overview. 
2. System should display each task unit with information contains start time, due time, subordinate, stage, priority and description.
3. House owner have no right to edit/modify whatever he/she sees.
4. System should divide the jobs into four stages(Completed, Progressing, Overdue and Not Started) with different colors, when task is displayed in Kanban mode.  
5. System should display the project progress in creation order, when task is displayed in overview mode
6. House owner should be able to check the project state and if something went wrong he should be able to give feedback to manager.
7. House owner should be notified when new progresses are made.
8. House owner should be able to see the overall budget from the beginning of the project.



***Project manager***

1. Project manager should be able to View the whole project progress in Kanban or Task Overview. 
2. Each task unit should show the <u>start time, due time, subordinate, stage, priority and description</u>.
3. Project manager have the right to accept or reject the work progress, then upload the confirm record or give a feedback.
4. When displayed in Kanban mode, system should divide the jobs into four stages(Completed, Progressing, Overdue and Not Started) with different colors.  
5. In overview mode, system should display the project progress in creation order.
6. Project manager should be able to check the current project state and upload the record log.
7. Project manager should be notified when house owner have rework requirements on some tasks or have any feedback.
8. Project manager should be able to see the overall budget from the beginning of the project to current stage.
9. Project manager should be able to create new project by template in database.
10. When project create from template, project manager should be able to Initialize a detail home decoration process flow by a process list, which has priority and sub project.
11. When project create from template, project manager should be able to initialize the material management list according to the provided construction specification, which has fundamental budget and suppliers' information.
12. When project created from template, project manager should be able to initialize the staff composition list which contains the information about the job category and the contact information. Project manager can select different construction teams to participate the project.
13. Project manager should be able to create invitation link to invite other users (workers or house owners) to participate in the project.



***Material manager***

1. Material manager should be able to view all his tasks in Task Overview.
2. Material manager is not allowed to create assignments on his own and could only accept task assigned by project manager. 
3. System should display each task unit is supposed with information contains type, quantity of materials, destination address and deadline of delivery.
4. System should display the items contained in Task Overview from top to bottom according to how much time is left.
5. Material manager should be able to click button "complete" to confirm that he has finished this task. After that, this item will be deleted automatically from Task Overview and project manager can receive notification message as well.
6. Material manager should be able to notify the manger if the task can not be finished on time for some reason and could click button "modify" to apply for extending deadline or increasing budget. 



***Worker***

1. Worker should be able to view the introduction of his part of task, which include personnel involved in this task, engineering materials, specific engineering step's information and construction date(flexible time).
2. Workers should be able to update task progress.
3. Workers should be able to end subtask of a specific engineering step but could not create subtask.
4. Workers should be able to upload attachments.
5. Workers should be able to upload photos taken at the start of construction(record start time).
6. Workers should be able to upload photos taken at the end of construction(record end time).
7. Workers should be able to receive rework and specific information of house owner from Manager