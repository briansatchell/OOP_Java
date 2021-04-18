Group Members:
- Dennis Lim
- Josh Achorn
- Brian Satchell

Description of our design

We created an abstract class Animal and it
has the private variables: name, animal, and sleep status 

the two methods roam and makeNoise are both abstract methods because 
- every Canine, Feline, and Pachyderm extends Animal but they all roam differently
- every animal make different noises even though they are a sub-sub class of Animal 
this is taking advantage of polymorphism because we can still inherit all the characteristics
of an animal for every animal but can overide the methods for them to be unqiue to that 
specific animal

but the other other methods: 
- setters/getters for name, animaName, and sleep status
- sleeping, waking up, eating, exercise, and action


for the animal cat we overide the action method so that it will perform random actions
but the other animalsTypes are going to perform what action is being told


ref we used:
https://www.geeksforgeeks.org/redirecting-system-out-println-output-to-a-file-in-java/
- to redirect our system.out to a text file instead a console

to run the code ( I was using intellij) but I just clicked the run button or ctrl r

should produce a dayatthezoo.out file once program is done running in the project_1 dir
