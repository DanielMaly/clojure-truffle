(define line (read))
(display line) (newline)

(define num (read))
(display (+ (string->number num) 3)) (newline)

(define numF (read))
(display (/ (string->number numF) 2.0)) (newline)

(define b (read))
(display (eqv? (string->boolean b) #t)) (newline)
