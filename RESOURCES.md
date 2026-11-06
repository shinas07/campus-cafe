# 📚 Resources (picked for short study time)

Use these **next to** the lessons, not instead of them. Read only the part named for the phase you're in.

## ⭐ Main book (one book only)
**Learning Domain-Driven Design** — Vlad Khononov (O'Reilly, 2021)
- Why: the most beginner-friendly DDD book. Short chapters (~16 pages), exercises at the end, and honest about when DDD is overkill.
- Skip Eric Evans' "blue book" for now. It's the original, but it's heavy. Read it after Phase 4 if you want.
- Reading plan:
  - Phase 1 → Ch 1 (business domains), Ch 2 (ubiquitous language)
  - Phase 2 → Ch 5–6 (simple logic vs domain model)
  - Phase 3 → Ch 8 (architectural patterns)
  - Phase 4 → Ch 3–4 (bounded contexts, integration)
  - Phase 5–6 → Ch 7, 9 (event sourcing, communication patterns)
- Even shorter option: **Domain-Driven Design Distilled** — Vaughn Vernon (~150 pages).

## 🏛️ For RCMS-style architecture (Phase 3)
**Get Your Hands Dirty on Clean Architecture, 2nd ed.** — Tom Hombergs (2023, Java)
- Why: it's almost exactly the RCMS layout. `port/in`, `port/out`, `*UseCase`, adapters, mapping between domain and JPA entity.
- Focus on: Ch 3 (inverting dependencies), the mapping chapter, Ch 8 (testing).
- Code: https://github.com/thombergs/buckpal. Compare its folders with RCMS's.

## 🎥 Videos (short, practical): CodeOpinion (Derek Comartin)
Channel: https://www.youtube.com/@CodeOpinion
- Phase 1: The Power of Ubiquitous Language — https://www.youtube.com/watch?v=4j71Toy5ZLw
- Phase 2: Aggregates: Model Rules, Not Relationships — https://www.youtube.com/watch?v=ZvY5fREVyZk
- Phase 2: That's NOT an Aggregate — https://www.youtube.com/watch?v=LyRvB6m_uoA
- Anytime: STOP doing dogmatic DDD — https://www.youtube.com/watch?v=8XmXhXH_q90 (when NOT to use DDD)
- The examples are C#, but the ideas are the same in Java.

## 📝 Short articles (5 minutes each)
- Martin Fowler, Anemic Domain Model — https://martinfowler.com/bliki/AnemicDomainModel.html (read after Lesson 2)
- Martin Fowler, Value Object — https://martinfowler.com/bliki/ValueObject.html (Phase 2)
- Martin Fowler, Bounded Context — https://martinfowler.com/bliki/BoundedContext.html (Phase 4)

## ☕ Java gaps
- Java records (official) — https://dev.java/learn/records/ (before the Value Object lesson)

## 🌱 Spring (Phases 4–5)
- Spring Modulith events reference — https://docs.spring.io/spring-modulith/reference/events.html
- Baeldung, Intro to Spring Modulith — https://www.baeldung.com/spring-modulith
- Baeldung, DDD aggregates and @DomainEvents — https://www.baeldung.com/spring-data-ddd

## Book reviews I checked
- Virtual DDD reading list — https://virtualddd.com/reading-list/
- Book review on Medium — https://sodkiewiczm.medium.com/geek-read-learning-domain-driven-design-28e258a7e7b7
