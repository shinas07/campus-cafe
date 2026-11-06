# 📈 My DDD Progress — Campus Café

Goal: think in domains, model business problems, and build DDD code confidently (RCMS-ready).
Levels: ⬜ 0 not started · 🟥 1 heard of it · 🟧 2 can explain · 🟨 3 did the exercise · 🟩 4 used it in code · 💎 5 can teach it

## Skill map

### Foundations (Java + OOP)
| Skill | Level | Notes |
|---|---|---|
| `private` / `final` / encapsulation | 🟥 1 | Spotted `public` field danger in the assessment 👍 |
| `record` | 🟨 3 | Saw two `Money(50)` are equal (value-based equals) |
| Interfaces | 🟥 1 | Mixed up with "DB layer" — it's a contract (wall socket) |
| SOLID: S, O | 🟧 2 | |
| SOLID: L | 🟥 1 | "Child must work wherever the parent is expected" |
| SOLID: I, D | ⬜ 0 | D comes in Phase 3 (ports & adapters) |
| JPA `@Entity` / `JpaRepository` | 🟥 1 | `@Entity` goes on the class; repo gives save/find/delete |

### Phase 1 — Thinking in the domain
| Skill | Level |
|---|---|
| Domain, subdomain | ⬜ 0 |
| Core / supporting / generic subdomains | ⬜ 0 |
| Ubiquitous language | 🟥 1 |

### Phase 2 — Building blocks (tactical)
| Skill | Level |
|---|---|
| Value Objects | 🟨 3 |
| Entities | 🟨 3 |
| Invariants & rich domain model | 🟧 2 |
| Aggregates & aggregate roots | 🟧 2 |
| Repositories | ⬜ 0 |
| Domain services | ⬜ 0 |
| Application services (use cases) | ⬜ 0 |
| Factories (`create` / `reconstitute`) | ⬜ 0 |

### Phase 3 — Architecture like RCMS
| Skill | Level |
|---|---|
| Dependency inversion | ⬜ 0 |
| Hexagonal: ports & adapters | ⬜ 0 |
| Domain model vs JPA entity + mapper | ⬜ 0 |
| Testing the domain (JUnit, Mockito) | ⬜ 0 |

### Phase 4 — Big picture (strategic)
| Skill | Level |
|---|---|
| Bounded contexts | 🟥 1 |
| Context mapping | ⬜ 0 |
| Anti-corruption layer | ⬜ 0 |
| Spring Modulith modules | ⬜ 0 |

### Phase 5 — Events
| Skill | Level |
|---|---|
| Domain events | ⬜ 0 |
| Eventual consistency | ⬜ 0 |
| Transactional outbox | ⬜ 0 |
| Idempotency | ⬜ 0 |
| Saga | ⬜ 0 |

### Phase 6 — Advanced
| Skill | Level |
|---|---|
| CQRS | ⬜ 0 |
| Event sourcing (light) | ⬜ 0 |
| ArchUnit architecture tests | ⬜ 0 |

## Lesson log
| # | Date | Topic | Result |
|---|---|---|---|
| 0 | 2026-11-06 | Assessment | Baseline set. Java beginner, DDD near zero, good instinct on encapsulation |
| 1 | 2026-11-06 | What is a domain? Subdomains | Explained with biryani analogy; exercise skipped to start coding. Revisit |
| 2 | 2026-11-06 | Project setup (Spring Boot skeleton) | ✅ Done by you: build + test passing, pushed |
| 3 | 2026-11-06 | Value Object: `Money` | ✅ record + "never negative" invariant guard. Tests skipped for now |
| 4 | 2026-11-06 | Entity + Aggregate: `Order`, `OrderId`, `OrderStatus`, `OrderLine` | ✅ Rules inside Order (pay, addItem). Fixed missing NEW status bug |

## Weak spots to revisit
- Core / supporting / generic: exercise not done yet (pickup slots, staff login, stock)
- Where business rules live (assessment Q10: said "service class") → revisit in Lesson 2–3
- Interface = contract, not a DB thing
- `double` for money is a trap

## Checkpoints
- [ ] Phase 1 checkpoint: map the Campus Café domain
- [ ] Phase 2 checkpoint: build the Order aggregate with tests
- [ ] Phase 3 checkpoint: one full use case, RCMS style
- [ ] Phase 4 checkpoint: split into Modulith modules
- [ ] Phase 5 checkpoint: order paid → kitchen notified via events
- [ ] Phase 6 checkpoint: design review of the whole system
