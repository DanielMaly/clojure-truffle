## Language support

### Current support:

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


### Missing syntactic support:
  * CASE expressions
  * Character literals
  * List literals
  * Vectors
  * LET (let, letrec, letstar)
  * Loops
  * Quotes
  * Dot-style definitions and arguments

### Implemented builtin functions:
  * '+', '/', '*', '-'
  * '=', not
  * '<', '>', '<=', '>=' (numeric types only)
  * display, newline

### All supported builtin functions:
  * '+', '/', '*', '-', '%'
  * '<', '>', '<=', '>='
  * '=', eqv?, eq?, equal?, not
  * display, newline
  * read
  * list, cons, car, cdr, length
  * length, append, reverse
  * type predicates (boolean? number? symbol? procedure? null? zero? odd? even?)
  * apply, map


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
  * Added functions: 'not', 'cons', 'car', 'cdr', 'list'
  * Added support for boolean literals
  * Added support for 'and' and 'or' expressions
