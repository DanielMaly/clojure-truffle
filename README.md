## Language support

### Current syntactic support:

  * define
  * lambda
  * procedure calls
  * if
  * cond
  * integer literals
  * float literals
  * string literals
  * boolean literals
  * AND and OR

### Missing syntactic support for Scheme compatibility:
  * Loops
  * Character literals
  * Empty lists
  * CASE expressions
  * Vectors
  * LET (let, letrec, letstar)
  * Quotes and list literals
  * Dot-style definitions and arguments
  * Define-syntax
  * Macros
  * Possibly others

### Implemented builtin functions:
  * '+', '/', '*', '-', '%'
  * '<', '>', '<=', '>=' (numeric types only)
  * '=', eqv?, eq?, equal?, not
  * display, newline (stdout only)
  * read (stdin only, reads lines)
  * string, string->number, string->boolean
  * type predicates (boolean? number? char? string? procedure? null? zero?)
  * list, cons, car, cdr
  * length, append, reverse
  * map

### Planned supported builtin functions:
  * string->list
  * char?
  * apply


## Version history

### v0.1.0
  * Basic support necessary to run the 99 bottles program
  * '-'. '=', display, newline
  * '<', '>', '<=', '>=' (numeric types only)
  * Framework for language tests
  * Framework for timed benchmarks

### v0.1.1
  * Added support for float literals
  * Added support for '+', '*' and '/' (integral and floating-point)
  * rec.scm tests

### v1.0.0
  * Rewrote the whole interpreter using Truffle
  * Removed support for dot-style arguments

### v1.1.0
  * Added basic functions 'not', '%', 'eqv?', 'eq?', 'equal?'
  * Added list processing functions: 'cons', 'car', 'cdr', 'list', 'append', 'length', 'reverse', 'map'
  * Added support for boolean literals
  * Added support for 'and' and 'or' expressions
  * Added support for reading from stdin using the 'read' function
  * Added conversion functions 'string', 'string->number', 'string->boolean'
  * Added type predicates
