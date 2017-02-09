;;; Predicates

(define compTrue (= 5 5))
(define compFalse (< 5 5))
(display (and compTrue compFalse)) (newline)
(display (or compTrue compFalse)) (newline)
(display (and compTrue #t (>= 10 5))) (newline) ; Testing multiple conditions
(display (or compFalse #t (display "Hello"))) (newline) ; Last test shouldn't be evaluated
(display (and compTrue #f (display "Hello"))) (newline) ; Last test shouldn't be evaluated
(newline)