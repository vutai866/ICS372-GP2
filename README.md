# ICS372-GP2
Metropolitan State University - ICS370 - Group Project 2

Goals:
1. Perform finite-state modeling techniques to come up with the state transition table and diagram.
2. Identify the classes in an FSM-based system with minimal conditionals.
3. Use the Unified Modeling Language to document work.
4. Work in small groups.
5. Implement a design utilizing structures such as classes and interfaces.
6. Employ Java coding standards.
The Problem
You need to use the FSM approach to model, design, and implement a train that goes in a loop around the terminals of an airport. Each terminal has a station at which the train stops. As you will see, the number of stations is irrelevant. The system works as follows.
After starting from a station, the train accelerates for 6 seconds, before it attains full speed. At some point, perhaps after attaining full speed, the train keeps running until it gets a signal that it is approaching a station. At that time, it decelerates. The signal that the train is approaching a station might come even before the 6-second acceleration period ends; if that happens, the train starts decelerating.
At some point after decelerating, the train receives a signal that it has arrived at a station. The train immediately stops.
1 second after the train stops, the doors of the train start opening. It takes 4 seconds for the doors to open fully. The doors remain in the fully-open position for 30 seconds. After that the doors start closing. It takes 5 seconds for the doors to close.
As the doors are closing, there could be obstructions, such as travelers walking through. On detection of such obstructions, the doors reopen: the reopening time is dependent on how far the door had closed. For example, if 3 seconds had elapsed after the closing process started, the time to fully reopen would be 3 * 4 / 5, that is roughly 2 seconds. (We will drop the fractions.) After fully reopening, the doors will reclose after 8 seconds. The doors may again encounter obstruction and the process could repeat.
After the doors are fully closed, the train starts moving (accelerating) after 3 seconds.
1
You must implement a controller for the above system using the FSM approach. The design and implementation must be consistent with the approach taken in the Microwave case study. There should be no conditionals in your implementation, except for unavoidable situations such as for implementing singletons.
