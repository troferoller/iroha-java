//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.expression

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.generated.datamodel.NumericValue
import jp.co.soramitsu.iroha2.wrapException

/**
 * Multiply
 *
 * Generated from 'iroha_data_model::expression::Multiply' regular structure
 */
public data class Multiply(
    public val left: EvaluatesTo<NumericValue>,
    public val right: EvaluatesTo<NumericValue>
) {
    public companion object : ScaleReader<Multiply>, ScaleWriter<Multiply> {
        public override fun read(reader: ScaleCodecReader): Multiply = try {
            Multiply(
                EvaluatesTo.read(reader) as EvaluatesTo<NumericValue>,
                EvaluatesTo.read(reader) as EvaluatesTo<NumericValue>,
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        public override fun write(writer: ScaleCodecWriter, instance: Multiply) = try {
            EvaluatesTo.write(writer, instance.left)
            EvaluatesTo.write(writer, instance.right)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
