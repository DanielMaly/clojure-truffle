(define fac
    (lambda (n)
        (if (= n 0)
            1
            (* n (fac (- n 1))))))

(display (fac 9))
(newline)


(define fib
           (lambda (n)
                   (if (= n 0)
                          0
                          (if (= n 1)
                                       1
                                      (+ (fib (- n 1)) (fib (- n 2)))))))

(display (fib 15))
(newline)

(define gcd
           (lambda (a b)
                   (if (= a b)
                          a
                          (if (> a b)
                                       (gcd (- a b) b)
                                      (gcd a (- b a))))))


(display (gcd 136 232))
(newline)


(display (/ 15 5))   ; 3
(newline)
(display (/ 15 4))   ; 3
(newline)
(display (/ 15.0 4.0)) ; 3.75
(newline)
