__Clean Code chapter 14__
This chapter is a case study in successive refinement. You will see a module that started
well but did not scale. Then you will see how the module was refactored and cleaned.
    Most  of  us  have  had  to  parse  command-line  arguments  from  time  to  time.  If  we
don’t have a convenient utility, then we simply walk the array of strings that is passed
into the main
but none of them do exactly what I want. So, of course, I decided to write my own. I call
it: Args.

     Args is very simple to use. You simply construct the Args class with the input argu-
ments and a format string, and then query the  Args instance for the values of the argu-
ments.
     You can see how simple this is. We just create an instance of the Args class with two
parameters. The ﬁrst parameter is the format, or schema, string:  "l,p#,d*." It deﬁnes three
command-line arguments. The ﬁrst, –l, is a boolean argument. The second, -p, is an integer
argument. The third, -d, is a string argument. The second parameter to the Args constructor
is simply the array of command-line argument passed into main.

     If  the  constructor  returns  without  throwing  an  ArgsException,  then  the  incoming
command-line  was  parsed,  and  the  Args instance  is  ready  to  be  queried.  Methods  like
getBoolean, getInteger, and getString allow us to access the values of the arguments by
their names.

     If there is a problem, either in the format string or in the command-line arguments
themselves,  an  ArgsException will  be  thrown.  A  convenient  description  of  what  went
wrong can be retrieved from the errorMessage method of the exception.

Args Implementation

Listing 14-2 is the implementation of the Args class. Please read it very carefully. I worked
hard on the style and structure and hope it is worth emulating.