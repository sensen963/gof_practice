# About

- 『ちょうぜつソフトウェア設計入門』(著:田中ひさてる)の第8章デザインパターンを読んだのでそれの復習用に記す
- 基本的にはコードをほぼ写経し実行できる単位まで変換する
- そのうえで使い勝手や使用用途などについて考察を加える
- 使用言語はOOPであれば何でも良かったが最近触っていなかったので復習がてらKotlinを選択する

# Pattern

## Template Method

### 概要

- 外から呼び出されるインターフェースを切り出し，幾つか実装において共通部分がある場合に使用される
- 共通部分はインターフェースを継承した抽象クラスに実装し，ロジック特有の処理に関しては抽象メソッドにしておいて具象クラスに実装させる．
- 同じものは継承元が書いてくれたらそれを再利用できるというナイーブなパターン

### メリット

- 具象クラスを分けず同じ抽象クラスを継承することで共通ロジックをコピペしなくて済む
- 共通処理をヘルパーメソッドに書き出すのに比べて，具象クラスの実装時に呼び出す処理すら書かなくても良くなる
- インターフェース，抽象クラスを使用しており初学者がつまづきがちな文法用途の解説に丁度よい

### デメリット

- 外部から操作できるのがインターフェース単位なので抽象クラス，具象クラス単位で少しでも異なるI/Fができない
- I/F上かなり強い制限になる
- 共通処理に関しても綺麗に一元化できるとは限らず，追加要次第ではほとんど具象クラスに持っていかれるのもあるある
- 個人的にはデバッガでコードを追っているときにどの具象クラスのロジックが動いているのかがわかりにくいので苦労した記憶がある