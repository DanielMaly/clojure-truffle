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
(display (length l3)) (newline)
(define l4 (list 1))
(append l4 l3)
(display (car (cdr l4))) (newline)
(display (reverse l3)) (newline)
(newline)


;;; Map
(define l5 (list 1 2 3 4))
(define l6 (map (lambda n (+ n 1)) l5))
(display l6) (newline)
(newline)


;;; Equality
(display (= 5 5)) (newline)
(display (= 5 6)) (newline)
(display (eqv? 5 5)) (newline)
(display (eqv? #t #t)) (newline)
(display (eqv? 5 6)) (newline)
(define l7 (list 1 2 3 4))
(display (equal? l7 l5)) (newline)
(display (equal? l4 l5)) (newline)
(display (equal? "Hello" "Hello")) (newline)
(display (equal? "H" "A")) (newline)
(newline)

;;; Predicates
(display (boolean? #f)) (newline)
(display (boolean? 3)) (newline)
(display (boolean? compTrue)) (newline)

(display (number? 3)) (newline)
(display (number? 4.33)) (newline)
(display (number? #f)) (newline)
(display (number? "Hello")) (newline)

(define f (lambda name (begin
    (display "Hello ")
    (display name)
)))

(f "John") (newline)
(display (procedure? f)) (newline)
(display (procedure? (lambda n (+ n 1)))) (newline)
(display (procedure? "Hello")) (newline)

(display (string? "Hello")) (newline)
(display (string? 5)) (newline)

(display (zero? 5)) (newline)
(display (zero? (- 5 5))) (newline)

(define l9 (list 1 2))
(display (null? (car l9))) (newline)
(display (null? (cdr (cdr l9)))) (newline)