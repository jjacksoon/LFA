def afd(Q, Sigma, delta, q0, F, cadeia):
  qA = q0
  for s in cadeia:
    qA = delta[(qA,s)]
  return qA in F

delta = {
  ('q0','a'): 'q0',
  ('q0','b'): 'q1',
  ('q1','b'): 'q2',
  ('q2','c'): 'q1',
  }
Q = ['q0','q1','q2']  
F = ['q2']
Sigma = ['a','b','c']
cadeia = 'abb'
afd(Q, Sigma, delta,'q0',F, cadeia)