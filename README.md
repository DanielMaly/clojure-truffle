## Language support

### Current support:

  * define
  * lambda
  * procedure calls
  * if
  * cond
  * integer literals
  * string literals

### Missing syntactic support:
  * AND and OR
  * CASE expressions
  * Boolean literals
  * Character literals
  * List literals
  * Vectors
  * LET (let, letrec, letstar)
  * Loops
  * Quotes

### Implemented builtin functions:
  * '-'
  * '='
  * '<', '>', '<=', '>=' (numeric types only)
  * display, newline

### All supported builtin functions:
  * '+', '/', '*'
  * '<', '>', '<=', '>='
  * '=', eqv?, eq?, equal?
  * display, newline
  * read
  * list, cons, car, cdr
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

