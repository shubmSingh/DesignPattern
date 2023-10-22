While creating object when object contain many attributes there are many problem exists:
1-we have to pass many argument to create object.
2-some parameter might be optional
3-factory class take all responsibility for creating object. if the object is heavy than all complexity is
part of  factory class.

So, in Builder design we create object step by step nd finally return final object with desired
values of attributes.

