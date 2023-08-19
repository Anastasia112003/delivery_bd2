CREATE TABLE delivery
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR NOT NULL,
    info jsonb DEFAULT '[
      {
        "number": 0,
        "phone": 0,
        "email": null
      }
    ]'
);