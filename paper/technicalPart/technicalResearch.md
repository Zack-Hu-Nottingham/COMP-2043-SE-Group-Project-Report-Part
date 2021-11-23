### Background of technical research

Before starting the technical research part, let's first think about what kind of problem we are facing and what the client is asking for. Our understanding towards the project is to develop an applet with graphical interface that could help manager and house owner to have a better view of the process of home decoration. It is not in pursuit of ultimate efficiency e.g. how to solve project management problem in O(n). Client would be more focused on the interaction with the applet. Whether its reaction is smooth, whether its graphic interface is precise and beautiful is what they care. Moreover, let's look deep into the home decoration project. The whole project would be divided into 14 sub-stages, at any time the project could only be in one sub-stage. With in each sub-stage, frankly speaking, only up to 2 tasks would be carried out at the same time. Which means for most of the time, the project is just doing one specific job. So it is meaningless for us to draw activity on node diagram or network diagram, as the final diagram would not be like a network, but more like a sugarloaf =). Thus, implementing the cutting edge technology such as Genetic algorithm, frog-leaping optimization algorithm are just like using a sledgehammer to crack a nut... Our decision toward this case is to use critical path method(CPM) maybe would combine with material requirements planning(MRP).

### What is critical path method(CPM)? (修改，需要引用论文)

The Critical Path Method (CPM) is a technique where you identify the tasks required to complete a project and determine the flexibility of scheduling. The critical path in project management is the longest sequence of activities that must be completed on time in order to complete the entire project. Any delays in critical tasks will delay the rest of the project.

CPM revolves around discovering the most important tasks in the project timeline, identifying task dependencies and calculating the duration of tasks.

CPM was developed in the late 1950s as a solution to the problem of increased costs due to inefficient scheduling. Since then, CPM has become a popular method for planning projects and prioritizing tasks. It helps project manager to break down complex projects into individual tasks and to better understand the flexibility of the project.

### How we implemented CPM?（需要提供wbs图，network图）

Firstly, we listed all the activities\tasks. Here we used a work breakdown structure to list all the project activities and produce the deliverables. The list of activities in the work breakdown structure serves as the foundation for the rest of the CPM. 

Secondly, based on the work breakdown structure we draw, we figured out the tasks that are dependent on one another. This will also help us identify any work that can be done in parallel with other tasks. The list of dependent tasks is referred to as an activity sequence, which will be used later to determine the critical path. 

Afterwards, we turned the work breakdown structure into a network diagram, which is a flowchart displaying the chronology of activities. In network diagram, each task is encapsulated into a box and connected with arrows to depict dependencies. Then the estimate task duration is write onto each box. With upper left corner early start(ES) date, upper right corner early finish(LF) date, lower left corner late start(LS) date and lower right corner late finish(LF) date. Then the critical path is right in front of us, the sequence of activities with the longest duration is the critical path.



project是啥

什么是一个项目，家装项目，经典流程图



工序是什么，有哪些参数最早最晚，资源约束

定义

cpm可以举一个例子





