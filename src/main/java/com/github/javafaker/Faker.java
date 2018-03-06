package com.github.javafaker;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;
import java.util.Random;

/**
 * Provides utility methods for generating fake strings, such as names, phone
 * numbers, addresses. generate random strings with given patterns
 *
 * @author ren
 */
public class Faker {
    private final RandomService randomService;
    private final FakeValuesService fakeValuesService;

    public Faker() {
        this(Locale.ENGLISH);
    }

    public Faker(Locale locale) {
        this(locale, null);
    }

    public Faker(Random random) {
        this(Locale.ENGLISH, random);
    }

    public Faker(Locale locale, Random random) {
        this.randomService = new RandomService(random);
        this.fakeValuesService = new FakeValuesService(locale, randomService);
    }

    /**
     * Constructs Faker instance with default argument.
     *
     * @return {@link Faker#Faker()}
     */
    public static Faker instance() {
        return new Faker();
    }

    /**
     * Constructs Faker instance with provided {@link Locale}.
     *
     * @param locale - {@link Locale}
     * @return {@link Faker#Faker(Locale)}
     */
    public static Faker instance(Locale locale) {
        return new Faker(locale);
    }

    /**
     * Constructs Faker instance with provided {@link Random}.
     *
     * @param random - {@link Random}
     * @return {@link Faker#Faker(Random)}
     */
    public static Faker instance(Random random) {
        return new Faker(random);
    }

    /**
     * Constructs Faker instance with provided {@link Locale} and {@link Random}.
     *
     * @param locale - {@link Locale}
     * @param random - {@link Random}
     * @return {@link Faker#Faker(Locale, Random)}
     */
    public static Faker instance(Locale locale, Random random) {
        return new Faker(locale, random);
    }

    /**
     * Returns a string with the '#' characters in the parameter replaced with random digits between 0-9 inclusive.
     * <p>
     * For example, the string "ABC##EFG" could be replaced with a string like "ABC99EFG".
     *
     * @param numberString
     * @return
     */
    public String numerify(String numberString) {
        return fakeValuesService.numerify(numberString);
    }

    /**
     * Returns a string with the '?' characters in the parameter replaced with random alphabetic
     * characters.
     * <p>
     * For example, the string "12??34" could be replaced with a string like "12AB34".
     *
     * @param letterString
     * @return
     */
    public String letterify(String letterString) {
        return fakeValuesService.letterify(letterString);
    }

    /**
     * Returns a string with the '?' characters in the parameter replaced with random alphabetic
     * characters.
     * <p>
     * For example, the string "12??34" could be replaced with a string like "12AB34".
     *
     * @param letterString
     * @param isUpper
     * @return
     */
    public String letterify(String letterString, boolean isUpper) {
        return fakeValuesService.letterify(letterString, isUpper);
    }

    /**
     * Applies both a {@link #numerify(String)} and a {@link #letterify(String)}
     * over the incoming string.
     *
     * @param string
     * @return
     */
    public String bothify(String string) {
        return fakeValuesService.bothify(string);
    }

    /**
     * Applies both a {@link #numerify(String)} and a {@link #letterify(String)}
     * over the incoming string.
     *
     * @param string
     * @param isUpper
     * @return
     */
    public String bothify(String string, boolean isUpper) {
        return fakeValuesService.bothify(string, isUpper);
    }

    /**
     * Generates a String that matches the given regular expression.
     */
    public String regexify(String regex) {
        return fakeValuesService.regexify(regex);
    }

    public RandomService random() {
        return this.randomService;
    }

    FakeValuesService fakeValuesService() {
        return this.fakeValuesService;
    }

    public Ancient ancient() {
        return new Ancient(this);
    }

    public App app() {
        return new App(this);
    }

    public Artist artist() {
        return new Artist(this);
    }

    public Avatar avatar() {
        return new Avatar(this);
    }

    public Music music() {
        return new Music(this);
    }

    public Name name() {
        return new Name(this);
    }

    public Number number() {
        return new Number(this);
    }

    public Internet internet() {
        return new Internet(this);
    }

    public PhoneNumber phoneNumber() {
        return new PhoneNumber(this);
    }

    public Pokemon pokemon() {
        return new Pokemon(this);
    }

    public Lorem lorem() {
        return new Lorem(this);
    }

    public Address address() {
        return new Address(this);
    }

    public Book book() {
        return new Book(this);
    }

    public Business business() {
        return new Business(this);
    }

    public ChuckNorris chuckNorris() {
        return new ChuckNorris(this);
    }

    public Color color() {
        return new Color(this);
    }

    public Commerce commerce() {
        return new Commerce(this);
    }

    public Company company() {
        return new Company(this);
    }

    public Crypto crypto() {
        return new Crypto(this);
    }

    public Hacker hacker() {
        return new Hacker(this);
    }

    public IdNumber idNumber() {
        return new IdNumber(this);
    }

    public Options options() {
        return new Options(this);
    }

    public Code code() {
        return new Code(this);
    }

    public File file() {
        return new File(this);
    }

    public Finance finance() {
        return new Finance(this);
    }

    public Food food() {
        return new Food(this);
    }

    public GameOfThrones gameOfThrones() {
        return new GameOfThrones(this);
    }

    public DateAndTime date() {
        return new DateAndTime(this);
    }

    public Demographic demographic() {
        return new Demographic(this);
    }

    public Educator educator() {
        return new Educator(this);
    }

    public SlackEmoji slackEmoji() {
        return new SlackEmoji(this);
    }

    public Shakespeare shakespeare() {
        return new Shakespeare(this);
    }

    public Space space() {
        return new Space(this);
    }

    public Superhero superhero() {
        return new Superhero(this);
    }

    public Bool bool() {
        return new Bool(this);
    }

    public Team team() {
        return new Team(this);
    }

    public Beer beer() {
        return new Beer(this);
    }

    public University university() {
        return new University(this);
    }

    public Cat cat() {
        return new Cat(this);
    }

    public Stock stock() {
        return new Stock(this);
    }

    public LordOfTheRings lordOfTheRings() {
        return new LordOfTheRings(this);
    }

    public Zelda zelda() {
        return new Zelda(this);
    }

    public HarryPotter harryPotter() {
        return new HarryPotter(this);
    }

    public RockBand rockBand() {
        return new RockBand(this);
    }

    public Esports esports() {
        return new Esports(this);
    }

    public Friends friends() {
        return new Friends(this);
    }

    public Hipster hipster() {
        return new Hipster(this);
    }

    public Job job() {
        return new Job(this);
    }

    public TwinPeaks twinPeaks() {
        return new TwinPeaks(this);
    }

    public RickAndMorty rickAndMorty() {
        return new RickAndMorty(this);
    }

    public Yoda yoda() {
        return new Yoda(this);
    }

    public Matz matz() {
        return new Matz(this);
    }

    public Witcher witcher() {
        return new Witcher(this);
    }

    public Weather weather() {
        return new Weather(this);
    }

    public String resolve(String key) {
        return this.fakeValuesService.resolve(key, this, this);
    }

    /**
     * Allows the evaluation of native YML expressions to allow you to build your own.
     *
     * The following are valid expressions:
     * <ul>
     *     <li>#{regexify '(a|b){2,3}'}</li>
     *     <li>#{regexify '\\.\\*\\?\\+'}</li>
     *     <li>#{bothify '????','false'}</li>
     *     <li>#{Name.first_name} #{Name.first_name} #{Name.last_name}</li>
     *     <li>#{number.number_between '1','10'}</li>
     * </ul>
     * @param expression (see examples above)
     * @return the evaluated string expression
     * @throws RuntimeException if unable to evaluate the expression
     */
    public String expression(String expression) {
        return this.fakeValuesService.expression(expression, this);
    }
}
