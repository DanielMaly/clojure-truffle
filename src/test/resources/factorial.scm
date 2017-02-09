(define fac
    (lambda (n)
        (if (= n 0)
            1
            (* n (fac (- n 1))))))

(display (fac 5)) (newline)
(display (fac 10)) (newline)
(display (fac 12)) (newline)
(display (fac 15)) (newline)
(display (fac 16)) (newline)
(display (fac 20)) (newline)
(display (fac 21)) (newline)