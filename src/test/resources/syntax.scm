;;; Predicates

(define compTrue (= 5 5))
(define compFalse (< 5 5))
(display (and compTrue compFalse)) (newline)
(display (or compTrue compFalse)) (newline)
(display (and compTrue #t (>= 10 5))) (newline) ; Testing multiple conditions
(display (or compFalse #t (display "Hello"))) (newline) ; Last test shouldn't be evaluated
(display (and compTrue #f (display "Hello"))) (newline) ; Last test shouldn't be evaluated
(newline)

;;; Lists

(define l1 (cons 1 2))
(display (car l1)) (newline)
(display (car l1)) (newline)
(define l2 (cons 1 (cons 2 3)))
(display (car (cdr l2))) (newline)
(display (cdr (cdr l2))) (newline)

(define l3 (list 1 2 3 4))
(display (car l3)) (newline)
(display (car (cdr (cdr l3)))) (newline)
(newline)
