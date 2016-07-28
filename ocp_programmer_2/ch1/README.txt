this chapter covers the following topics:
 - access modifiers
 - overloading and overriding
 - static and final 
 - imports
 - instaceof
 - virtual method
 - equals, hashcode, tostring
 - enums
 - nested classes: member, local, static, anonymous

the program created is intended to cover all these topics.

THEME PARK

this application is designed to monitor each visitors interaction with various
theme park facilities. It is assumed the visitor is given a radio id tag upon
entry to the park and each facility has an rfid reader. 

The information to be collated is the following:
 - how many visitors attend the park and at which time of the year gets the
   most
 - which rides are the most popular
 - are the visitors returning

How learning outcomes are met:

 access modifiers: these will be commented on throughout the program, show
through commented out code what is not allowed

 overloading and overriding: commented throughout the program.

 static and final: static variables will be used to count the total number of
visitors, final veriables will be used to create the user id upon entering the
park, static final variables will be used throughout the program. Heavily
commented on.

 imports: the program will be created with the intention of generating a final
jar file, so the classes will be kept in appropriate folders, which will need
imports if accessed outside these folders.

 instanceof: used in conjunction with equals overriding to create a possible
early break point if the objects refer to different object hierarchys

virtual method: each facility will extend from an abstract class containing
information such as facility id, name etc.

equals, hashcode, tostring: these will be overrode on every object created to
facilitate learning.

 enums: used for visitor satisfaction results and seasonal data. at least one
will use constructors fields and methods.

 nested classes: anonymous classes will be used for direct interaction with
facility, local will be used mainly to show how it can be used, static will be
used to show how it access the outter class data, member will be used for
event handling methods.
